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
        name = "Taco Fiesta",
        description = "Authentic Mexican tacos and more.",
        imageUrl = "https://example.com/taco_fiesta.jpg",
        categories = listOf("Mexican Food"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Beef Tacos",
                description = "Soft tortillas filled with seasoned beef.",
                imageUrl = "https://example.com/beef_tacos.jpg"
            ),
            Dish(
                id = 4,
                name = "Chicken Tacos",
                description = "Grilled chicken with fresh toppings.",
                imageUrl = "https://example.com/chicken_tacos.jpg"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Chicken Delight",
        description = "The best fried and grilled chicken in town.",
        imageUrl = "https://example.com/chicken_delight.jpg",
        categories = listOf("Chicken"),
        menu = listOf(
            Dish(
                id = 5,
                name = "Fried Chicken",
                description = "Crispy and juicy fried chicken.",
                imageUrl = "https://example.com/fried_chicken.jpg"
            ),
            Dish(
                id = 6,
                name = "Grilled Chicken",
                description = "Perfectly seasoned grilled chicken.",
                imageUrl = "https://example.com/grilled_chicken.jpg"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Burger Haven",
        description = "Gourmet burgers with unique flavors.",
        imageUrl = "https://example.com/burger_haven.jpg",
        categories = listOf("Burgers"),
        menu = listOf(
            Dish(
                id = 7,
                name = "Classic Cheeseburger",
                description = "Beef patty with cheese, lettuce, and tomato.",
                imageUrl = "https://example.com/cheeseburger.jpg"
            ),
            Dish(
                id = 8,
                name = "Bacon Burger",
                description = "Juicy burger topped with crispy bacon.",
                imageUrl = "https://example.com/bacon_burger.jpg"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Sushi World",
        description = "Fresh sushi and Japanese cuisine.",
        imageUrl = "https://example.com/sushi_world.jpg",
        categories = listOf("Japanese"),
        menu = listOf(
            Dish(
                id = 9,
                name = "California Roll",
                description = "Crab, avocado, and cucumber roll.",
                imageUrl = "https://example.com/california_roll.jpg"
            ),
            Dish(
                id = 10,
                name = "Spicy Tuna Roll",
                description = "Tuna with a spicy kick.",
                imageUrl = "https://example.com/spicy_tuna.jpg"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Pasta House",
        description = "Homemade pasta dishes with rich flavors.",
        imageUrl = "https://example.com/pasta_house.jpg",
        categories = listOf("Italian", "Pizzas"),
        menu = listOf(
            Dish(
                id = 11,
                name = "Spaghetti Carbonara",
                description = "Creamy pasta with pancetta and parmesan.",
                imageUrl = "https://example.com/carbonara.jpg"
            ),
            Dish(
                id = 12,
                name = "Lasagna",
                description = "Layered pasta with meat and cheese.",
                imageUrl = "https://example.com/lasagna.jpg"
            )
        )
    )
)