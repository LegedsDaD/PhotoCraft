package com.legendworks.photocraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PhotoCraft 1.0.0 bootstrap.
 *
 * This first build establishes the complete content registry and crafting
 * progression. Camera UI, live framebuffer capture, image filtering and
 * persistent photo albums are intentionally separated into the next
 * implementation milestone so each can be tested against the 26.3 client API.
 */
public final class PhotoCraft implements ModInitializer {
    public static final String MOD_ID = "photocraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item POCKET_CAMERA_HD = item("pocket_camera_hd");
    public static final Item DIGITAL_CAMERA = item("digital_camera");
    public static final Item CINEMA_CAMERA = item("cinema_camera");
    public static final Item FILM_CAMERA = item("film_camera");

    public static final Item CAMERA_BODY = item("camera_body");
    public static final Item CAMERA_SENSOR = item("camera_sensor");
    public static final Item CAMERA_FLASH = item("camera_flash");

    public static final Item LENS_18MM = item("lens_18mm");
    public static final Item LENS_35MM = item("lens_35mm");
    public static final Item LENS_50MM = item("lens_50mm");
    public static final Item LENS_85MM = item("lens_85mm");
    public static final Item LENS_135MM = item("lens_135mm");
    public static final Item LENS_200MM = item("lens_200mm");
    public static final Item MACRO_LENS = item("macro_lens");

    public static final Item RED_FILTER = item("red_filter");
    public static final Item BLUE_FILTER = item("blue_filter");
    public static final Item GREEN_FILTER = item("green_filter");
    public static final Item YELLOW_FILTER = item("yellow_filter");
    public static final Item PURPLE_FILTER = item("purple_filter");
    public static final Item ORANGE_FILTER = item("orange_filter");
    public static final Item SEPIA_FILTER = item("sepia_filter");
    public static final Item MONOCHROME_FILTER = item("monochrome_filter");

    public static final Item CAMERA_STAND = item("camera_stand");
    public static final Item ADJUSTABLE_TRIPOD = item("adjustable_tripod");
    public static final Item CINEMA_STAND = item("cinema_stand");
    public static final Item PHOTO_PAPER = item("photo_paper");
    public static final Item UNDEVELOPED_PHOTO = item("undeveloped_photo");
    public static final Item DEVELOPED_PHOTO = item("developed_photo");
    public static final Item PHOTO_GALLERY = item("photo_gallery");
    public static final Item DEVELOPING_TABLE = item("developing_table");

    private static Item item(String path) {
        return Registry.register(
            BuiltInRegistries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, path),
            new Item(new Item.Properties())
        );
    }

    @Override
    public void onInitialize() {
        LOGGER.info("PhotoCraft 1.0.0 content registry initialized.");
    }
}
