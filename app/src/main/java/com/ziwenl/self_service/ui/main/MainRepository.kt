package com.ziwenl.self_service.ui.main

import com.ziwenl.baselibrary.base.repository.BaseRepositoryBoth
import com.ziwenl.baselibrary.base.repository.ILocalDataSource
import com.ziwenl.baselibrary.base.repository.IRemoteDataSource
import javax.inject.Inject

/**
 * PackageName : com.ziwenl.self_service.ui.main
 * Introduction :
 */
class MainRepository @Inject constructor(
    remoteDatasource: MainRemoteDataSource,
    localDataSource: MainLocalDataSource
) : BaseRepositoryBoth<MainRemoteDataSource, MainLocalDataSource>(remoteDatasource, localDataSource)


class MainRemoteDataSource @Inject constructor() : IRemoteDataSource

class MainLocalDataSource @Inject constructor() : ILocalDataSource