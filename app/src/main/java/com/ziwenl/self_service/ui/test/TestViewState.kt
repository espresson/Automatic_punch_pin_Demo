package com.ziwenl.self_service.ui.test

/**
 * PackageName : com.ziwenl.self_service.ui.splash
 * Introduction :
 */
data class TestViewState(
    val isLoading: Boolean,
    val throwable: Throwable?,
    val downTimeLockScreen: Long,
    val downTimeUnlock: Long
) {

    companion object {

        fun initial(): TestViewState {
            return TestViewState(
                isLoading = false,
                throwable = null,
                downTimeLockScreen = -1L,
                downTimeUnlock = -1L
            )
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TestViewState

        if (isLoading != other.isLoading) return false
        if (throwable != other.throwable) return false
        if (downTimeLockScreen != other.downTimeLockScreen) return false
        if (downTimeUnlock != other.downTimeUnlock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = isLoading.hashCode()
        result = 31 * result + (throwable?.hashCode() ?: 0)
        return result
    }
}