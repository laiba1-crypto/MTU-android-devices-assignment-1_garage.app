package com.example.mygarageapp;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemsCollection {
    public static final String carUrl = "https://c0.carsie.ie/d43864c90df075c94489ddbe4ca5ffe9db2785256d76500675a2327f960efaf7.jpg";
    public static final String car2 = "https://c0.carsie.ie/d43864c90df075c94489ddbe4ca5ffe9e6091497892ef9d0f8328a94ec1a3e14.jpg";

    public static final String bikeUrl1 = "https://c0.carsie.ie/d43864c90df075c94489ddbe4ca5ffe9213388e35bcabdf4e7292bd442b04ad1.jpg";
    public static final String bikeUrl2 = "https://c0.carsie.ie/d43864c90df075c94489ddbe4ca5ffe970c401750c87b44c3ac7c131d9f815ea.jpg";

    public static final String otherUrl1 = "https://cdn.autodoc.de/thumb?id=13109318&m=1&n=0&lng=en&rev=94077848";
    public static final String otherUrl2 = "https://cdn.autodoc.de/thumb?id=1511455&m=1&n=0&lng=en&rev=94077848";

    public static final String itemURL1 = "https://www.carzone.ie/used-cars/audi/a1/fpa/3525065?SOURCE_ID=SOURCE_ID_FPA_FROM_FEAT_LIST&journey=FeaturedListing";
    public static final String itemURL2 = "https://www.carzone.ie/used-cars/audi/a1/fpa/202210261091060?journey=Search";
    public static final String itemURL3 = "https://www.carzone.ie/bikes/used/bmw/c400x/fpa/202309091753975?journey=Search";
    public static final String itemURL4 = "https://www.carzone.ie/bikes/used/bmw/c400-gt/fpa/202309091753974?journey=Search";
    public static final String itemURL5 = "https://www.auto-doc.ie/prestone/13109318";
    public static final String itemURL6 = "https://www.auto-doc.ie/ferodo/1511455";




    // Car Items
    public static final ArrayList<RecyclerViewItemModel> carItems = new ArrayList<>(Arrays.asList(
            new RecyclerViewItemModel(14490.0, carUrl, "2014 (142) Audi A1", "1.6 TDI S-line Sportsback 103BHP 3DR Manual",itemURL1),
            new RecyclerViewItemModel(37417.0, car2, "2024 (241) Audi A1", "A1 SPORTBACK 1.0 30TFSI S-LINE BLACK EDITION WITH COMFORT PACK",itemURL2)
    ));

    // Bike Items
    public static final ArrayList<RecyclerViewItemModel> bikeItems = new ArrayList<>(Arrays.asList(
            new RecyclerViewItemModel(9950.0, bikeUrl1, "2023 (232) BMW C400X", "* NEW UNREGISTERED * 0% Finance Available",itemURL3),
            new RecyclerViewItemModel(10200.0, bikeUrl2, "2023 (232) BMW C400 GT", "Alpine White * NEW UNREGISTERED *",itemURL4)
    ));

    // Other Items
    public static final ArrayList<RecyclerViewItemModel> otherItems = new ArrayList<>(Arrays.asList(
            new RecyclerViewItemModel(102010.0, otherUrl1, " 20l, -38(50/50)", "Prestone PAFR0007A Antifreeze",itemURL5),
            new RecyclerViewItemModel(3260.0, otherUrl2, "160 x 42 mm", "FERODO PREMIER FSB600 Brake Shoe Set",itemURL6)
    ));
}
