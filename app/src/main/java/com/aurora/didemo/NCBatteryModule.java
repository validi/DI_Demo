package com.aurora.didemo;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class NCBatteryModule {

    @Binds
  abstract Battery bindNCBattery(NikelCadmiumBattery nikelCadmiumBattery);
}
