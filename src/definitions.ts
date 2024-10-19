export interface detectWeightPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
