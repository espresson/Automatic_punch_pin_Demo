package com.ziwenl.self_service.ui.splash

import com.ziwenl.baselibrary.base.repository.BaseRepositoryRemote
import com.ziwenl.baselibrary.base.repository.IRemoteDataSource
import javax.inject.Inject

/**
 * PackageName : com.ziwenl.self_service.ui.splash
 * Introduction :
 */
class SplashRepository @Inject constructor(
    remoteDataSource: SplashRemoteDataSource
) : BaseRepositoryRemote<ISplashProfileDataSource>(remoteDataSource)

interface ISplashProfileDataSource : IRemoteDataSource

class SplashRemoteDataSource @Inject constructor() : ISplashProfileDataSource