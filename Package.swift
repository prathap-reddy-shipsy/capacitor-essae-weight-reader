// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorEssaeWeightReader",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "CapacitorEssaeWeightReader",
            targets: ["detectWeightPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "detectWeightPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/detectWeightPlugin"),
        .testTarget(
            name: "detectWeightPluginTests",
            dependencies: ["detectWeightPlugin"],
            path: "ios/Tests/detectWeightPluginTests")
    ]
)