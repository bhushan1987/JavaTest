package com.test;

import com.eqtechnologic.eqube.security.shared.model.db.table.Role;
import com.test.stream.DataBaseAsStream;
import com.test.stream.UIRole;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author bhushank
 */
public class UtilityTest {
    DataBaseAsStream dataBaseAsStream = new DataBaseAsStream();
    private Long id = new Long(0);

    @Test
    public void testConnection() throws SQLException, ClassNotFoundException {
        Connection connection = dataBaseAsStream.getConnection();
        Assert.assertTrue(connection != null);
    }

    @Test
    public void getRoles() throws SQLException, ClassNotFoundException {
        RoleConverter roleConverter = new RoleConverter();

        Function<Role, UIRole> uiConverter = role -> {
            UIRole uiRole = new UIRole();
            uiRole.setId(role.getId());
            uiRole.setUiRoleName(role.getRoleName() + "_UI");
            return uiRole;
        };

        Supplier<List<Role>> supplier = () -> new ArrayList<>();

        BiConsumer<List<Role>, Role> biConsumer = (roleList, role) -> roleList.add(role);

        List<Role> roles = dataBaseAsStream.getRoles(roleConverter::getResultSetRoleFunction, supplier, biConsumer);
        roles.forEach(role -> System.out.println(role.getRoleName()));
    }

    class RoleConverter{
        @NotNull
        public Role getResultSetRoleFunction(ResultSet resultSet) {

                Role aRole = new Role();
                try {
                    aRole.setId(resultSet.getLong("ID"));
                    aRole.setRoleName(resultSet.getString("ROLE_NAME"));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                return aRole;

        }
    }



}
