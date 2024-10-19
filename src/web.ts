import { WebPlugin } from '@capacitor/core';

import type { detectWeightPlugin } from './definitions';

export class detectWeightWeb extends WebPlugin implements detectWeightPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
