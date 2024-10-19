# capacitor-essae-weight-reader

Easse weight detect through bluetooth

## Install

```bash
npm install capacitor-essae-weight-reader
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`mapSettings(...)`](#mapsettings)
* [`getWeight(...)`](#getweight)
* [`tareWeight(...)`](#tareweight)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### mapSettings(...)

```typescript
mapSettings(options: { deviceAddress: string; }) => Promise<void>
```

| Param         | Type                                    |
| ------------- | --------------------------------------- |
| **`options`** | <code>{ deviceAddress: string; }</code> |

--------------------


### getWeight(...)

```typescript
getWeight(options: { deviceAddress: string; deviceName: string; }) => Promise<{ weight: string; }>
```

| Param         | Type                                                        |
| ------------- | ----------------------------------------------------------- |
| **`options`** | <code>{ deviceAddress: string; deviceName: string; }</code> |

**Returns:** <code>Promise&lt;{ weight: string; }&gt;</code>

--------------------


### tareWeight(...)

```typescript
tareWeight(options: { deviceAddress: string; }) => Promise<void>
```

| Param         | Type                                    |
| ------------- | --------------------------------------- |
| **`options`** | <code>{ deviceAddress: string; }</code> |

--------------------

</docgen-api>
