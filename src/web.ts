import { WebPlugin } from '@capacitor/core';

import type { detectWeightPlugin } from './definitions';

export class detectWeightWeb extends WebPlugin implements detectWeightPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
  async mapSettings(options: { deviceAddress: string }): Promise<void> {
    console.log('mapSettings', options);
    return
  }
  async getWeight(options: { deviceAddress: string, deviceName: string }): Promise<{ weight: string }>{
    console.log('getWeight', options);
    return { weight: '0' }
  }
  async tareWeight(options: { deviceAddress: string }): Promise<void>{
    console.log('tareWeight', options);
    return
  }
}
