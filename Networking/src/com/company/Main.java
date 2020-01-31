package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.flickr.com/services/feeds/photos_public.gne?tags=dogs");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            connection.setRequestProperty("User-Agent", "Chrome");
//            connection.setReadTimeout(15000);
//
//            int responseCode = connection.getResponseCode();
//            System.out.println("Response code: " + responseCode);
//
//            if (responseCode != 200) {
//                System.out.println("Error reading web page");
//                System.out.println(connection.getResponseMessage());
//                return;
//            }
//
//            BufferedReader inputReader = new BufferedReader(
//                    new InputStreamReader(connection.getInputStream()));
//
//            String line;
//            while ((line = inputReader.readLine()) != null) {
//                line = inputReader.readLine();
//                System.out.println(line);
//            }
//
//            inputReader.close();

            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));

            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                System.out.println("-------key = " + key);
                for (String string : value) {
                    System.out.println("value = " + value);
                }

//                String line = "";
//                while (line != null) {
//                    line = inputStream.readLine();
//                    System.out.println(line);
//                }
            }
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

// Test
//            URI uri = url.toURI();

//            URI uri = new URI("http://username:password@myserver.com:5000/" +
//                    "catalogue/phones?os=android#samsung");

//            URI uri = new URI("https://www.youtube.com/watch?v=7bB_fVDlvhc&t=629s");
//            URI baseURI = new URI("http://username:password@mynewserver.com:5000/");
//            URI uri1 = new URI("catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("catalogue/tvs?manufactures=samsung");
//            URI uri3 = new URI("store/locations?zip=12345");
//
//            URI resolvedURI1 = baseURI.resolve(uri1);
//            URI resolvedURI2 = baseURI.resolve(uri2);
//            URI resolvedURI3 = baseURI.resolve(uri3);
//
//            URL url1 = resolvedURI1.toURL();
//            System.out.println("URL1 = " + url1);
//
//            URL url2 = resolvedURI2.toURL();
//            System.out.println("URL2 = " + url1);
//
//            URL url3 = resolvedURI3.toURL();
//            System.out.println("URL3 = " + url1);
//
//            URI relativizedURI = baseURI.relativize(resolvedURI2);
//            System.out.println("Relative URI = " + relativizedURI);
//
////            URI uri = new URI("Hello");

//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());

//        } catch (URISyntaxException e) {
//            System.out.println("URI Bad Syntax: " + e.getMessage());
//catch (MalformedURLException e) {
//        System.out.println("URL Malformed: " + e.getMessage());
//        }