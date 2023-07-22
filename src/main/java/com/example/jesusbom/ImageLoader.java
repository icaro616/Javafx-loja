package com.example.jesusbom;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class ImageLoader {

    private static final Map<String, Image> imageCache = new HashMap<>();

    public static Image loadImage(String imageName) {
        if (imageCache.containsKey(imageName)) {
            return imageCache.get(imageName);
        } else {
            try {
                String path = "/img/" + imageName;
                java.net.URL imageURL = ImageLoader.class.getResource(path);

                if (imageURL != null) {
                    Image image = new Image(imageURL.toExternalForm());
                    imageCache.put(imageName, image);
                    return image;
                } else {
                    System.err.println("Erro ao carregar a imagem: " + imageName);
                    return null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}