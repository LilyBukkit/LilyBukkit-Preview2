package ru.vladthemountain.lilybukkit.core.util;

import org.bukkit.Bukkit;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UpdateChecker {
    public static void checkForUpdates() {

        String url = "https://api.github.com/repos/LilyBukkit/LilyBukkit-Preview2/releases/latest";
        String charset = StandardCharsets.UTF_8.name();

        JSONObject responseBody;
        try {
            URLConnection urlConnection = new URL(url).openConnection();
            urlConnection.setRequestProperty("Accept-Charset", charset);
            InputStream response;
            try {
                response = urlConnection.getInputStream();
            } catch (IOException e) {
                throw new RuntimeException("Could not initialize a response InputStream for " + url, e);
            }
            try (Scanner scanner = new Scanner(response)) {
                try {
                    responseBody = (JSONObject) new JSONParser().parse(scanner.useDelimiter("\\A").next());
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Could not establish a connection with " + url, e);
        }

        String versionName = (String) responseBody.get("name");

        if (!(Bukkit.getServer().getName() + " " + Bukkit.getServer().getVersion()).equals(versionName)) {
            System.out.println("### An update for LilyBukkit is available: " + versionName + " ###");
        } else {
            System.out.println("### You're using the latest LilyBukkit build ###");
        }
    }
}
