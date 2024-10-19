export interface detectWeightPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  mapSettings(options: { deviceAddress: string }): Promise<void>;
  getWeight(options: { deviceAddress: string, deviceName: string }): Promise<{ weight: string }>;
  tareWeight(options: { deviceAddress: string }): Promise<void>;
}
