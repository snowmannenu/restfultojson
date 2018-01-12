package com.ws.json.client;
import com.sun.deploy.net.HttpResponse;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.StatusLine;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestFulTest {

    //private static final String targetURL = "http://localhost:8080/toJson/student/student/4/info?name=zhangzhijia";
    private static final String targetURL = "http://localhost:8080/student/student/2/info2?name=zhangzhijia";
    public static void main(String[] args) {

        try {
            URL targetUrl = new URL(targetURL);

            HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
            //httpConnection.setDoOutput(true);
            httpConnection.setDoInput(true);
            //httpConnection.setUseCaches(false);
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("ACCEPT", "application/json");

            //String input = "{\"name\":\"zhangzhijia\"}";

            //OutputStream outputStream = httpConnection.getOutputStream();
            //ObjectOutputStream objOutputStrm = new ObjectOutputStream(outputStream);
            //objOutputStrm.writeObject(input.getBytes());
            //outputStream.flush();
            //outputStream.close();
            //outputStream.write(input.getBytes());
            //outputStream.flush();
            //int code =httpConnection.getResponseCode();
            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + httpConnection.getResponseCode());
           }

            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                    (httpConnection.getInputStream())));

            String output;
            System.out.println("Output from Server:\n");
            while ((output = responseBuffer.readLine()) != null) {
                System.out.println(output);
            }

            httpConnection.disconnect();


        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}