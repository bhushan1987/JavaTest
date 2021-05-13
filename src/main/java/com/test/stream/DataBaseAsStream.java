package com.test.stream;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Author bhushank
 */
public class DataBaseAsStream {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@dt-anurag.technologic.com:1521:ORCL" , "EQ_SECURITY_PRODUCT" , "EQ_SECURITY_PRODUCT");
        return connection;
    }

    public <T, A> A getRoles(Function<ResultSet, T> converter, Supplier<A> supplier, BiConsumer<A, T> biConsumer) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from SS_ROLES");
        A a = supplier.get();

        while(resultSet.next()) {
            T aRole = converter.apply(resultSet);
            biConsumer.accept(a, aRole);
        }

        return a;
    }

    public <T> Stream<T> getResultSetAsStream() {

        return null;
    }

    private class ResultSetIterator<T> {
        T resultSetSupplier(){
            return null;
        }
    }
}
