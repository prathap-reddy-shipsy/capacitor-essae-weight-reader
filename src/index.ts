import { registerPlugin } from '@capacitor/core';

import type { detectWeightPlugin } from './definitions';

const detectWeight = registerPlugin<detectWeightPlugin>('detectWeight', {
  web: () => import('./web').then((m) => new m.detectWeightWeb()),
});

export * from './definitions';
export { detectWeight };
