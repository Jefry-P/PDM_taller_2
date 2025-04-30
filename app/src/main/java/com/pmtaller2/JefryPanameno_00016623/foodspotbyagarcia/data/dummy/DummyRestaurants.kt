package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.dummy

import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Dish
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Hut",
        description = "Delicious handmade pizzas with fresh ingredients.",
        imageUrl = "https://1000marcas.net/wp-content/uploads/2020/01/Pizza-Hut-Logo-1999.jpg",
        categories = listOf("Pizzas"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Margherita Pizza",
                description = "Classic pizza with tomato, mozzarella, and basil.",
                imageUrl = "https://imag.bonviveur.com/pizza-margarita.webp"
            ),
            Dish(
                id = 2,
                name = "Pepperoni Pizza",
                description = "Spicy pepperoni with melted cheese.",
                imageUrl = "https://cdn.unotv.com/images/2024/09/pizza-pepperoni-no-existe-italia-152140.jpeg"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "LacaLaca",
        description = "Authentic Mexican tacos and more.",
        imageUrl = "https://laca-laca.com/Content/img/historia2023.png",
        categories = listOf("Mexican Food"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Beef Tacos",
                description = "Soft tortillas filled with seasoned beef.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg/2560px-001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg"
            ),
            Dish(
                id = 4,
                name = "Chicken Tacos",
                description = "Grilled chicken with fresh toppings.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/10/Tacos_de_carne_asada_con_guacamole_y_cilantro.png"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Pollo Campero",
        description = "The best fried and grilled chicken in town.",
        imageUrl = "https://www.revistaeyn.com/binrepository/1350x900/75c0/1200d900/none/26086/GXIW/POLLOCAMPERO-GUATEMALA1_EN839948_MG233393853.jpg",
        categories = listOf("Chicken"),
        menu = listOf(
            Dish(
                id = 5,
                name = "Fried Chicken",
                description = "Crispy and juicy fried chicken.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/91/Kfc_chicken_potato.jpg"
            ),
            Dish(
                id = 6,
                name = "Grilled Chicken",
                description = "Perfectly seasoned grilled chicken.",
                imageUrl = "https://assets.epicurious.com/photos/5b843bce1abfc56568396369/1:1/w_2240,c_limit/Grilled-Chicken-with-Mustard-Sauce-and-Tomato-Salad-recipe-2-22082018.jpg"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Burger King",
        description = "Gourmet burgers with unique flavors.",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Burger_King_logo_%281999%E2%80%932020%29.svg/1024px-Burger_King_logo_%281999%E2%80%932020%29.svg.png",
        categories = listOf("Burgers"),
        menu = listOf(
            Dish(
                id = 7,
                name = "Classic Cheeseburger",
                description = "Beef patty with cheese, lettuce, and tomato.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Burger_King_Quad_Stacker_cheeseburger.jpg/2560px-Burger_King_Quad_Stacker_cheeseburger.jpg"
            ),
            Dish(
                id = 8,
                name = "Bacon Burger",
                description = "Juicy burger topped with crispy bacon.",
                imageUrl = "https://s7d1.scene7.com/is/image/mcdonaldsstage/DC_202302_3251-999_BaconCheeseburger_1564x1564?wid=1564&hei=1564&dpr=off"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Sushi Itto",
        description = "Fresh sushi and Japanese cuisine.",
        imageUrl = "https://plazamalta.com.sv/wp-content/uploads/2020/12/Sushiitto.png",
        categories = listOf("Japanese"),
        menu = listOf(
            Dish(
                id = 9,
                name = "California Roll",
                description = "Crab, avocado, and cucumber roll.",
                imageUrl = "https://plazamalta.com.sv/wp-content/uploads/2022/11/sushi1.jpg"
            ),
            Dish(
                id = 10,
                name = "Spicy Tuna Roll",
                description = "Tuna with a spicy kick.",
                imageUrl = "https://plazamalta.com.sv/wp-content/uploads/2022/11/sushi3.jpg"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Pastaria",
        description = "Homemade pasta dishes with rich flavors.",
        imageUrl = "https://tb-static.uber.com/prod/image-proc/processed_images/702ce3dd189e2569fe3ec25c3000277f/3ac2b39ad528f8c8c5dc77c59abb683d.jpeg",
        categories = listOf("Italian", "Pizzas"),
        menu = listOf(
            Dish(
                id = 11,
                name = "Spaghetti Carbonara",
                description = "Creamy pasta with pancetta and parmesan.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Classic-spaghetti-carbonara.jpg/500px-Classic-spaghetti-carbonara.jpg"
            ),
            Dish(
                id = 12,
                name = "Lasagna",
                description = "Layered pasta with meat and cheese.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Lasagna_food.jpg/960px-Lasagna_food.jpg"
            )
        )
    )
)