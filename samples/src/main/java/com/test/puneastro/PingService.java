package com.test.puneastro;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Add the Java doc here
 *
 * @author : bhushan.karmarkar@1eq.com
 * @Project : Security service
 * @Date : 10-02-2020
 * @since :
 */

public class PingService {

    private void poll() throws IOException, InterruptedException {
        URL puneAstroUrl = new URL("https://puneastro.in/");
        int i;
        while(true) {
            try {
                URLConnection urlConnection = puneAstroUrl.openConnection();
                urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 9; motorola one power) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.96 Mobile Safari/537.36");
                InputStream inputStream = urlConnection.getInputStream();
                while((i = inputStream.read())!=-1) {
                    // do nothing
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            Thread.sleep(3 * 60 * 1000); // 3 minutes
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new PingService().poll();
    }
}
