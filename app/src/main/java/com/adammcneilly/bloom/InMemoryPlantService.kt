package com.adammcneilly.bloom

import kotlinx.coroutines.delay

class InMemoryPlantService : PlantRepository {
    override suspend fun fetchThemes(): List<PlantTheme> {
        delay(5000)
        return defaultPlantThemes
    }

    override suspend fun fetchGardenItems(): List<PlantTheme> {
        return homeGardenThemes
    }
}