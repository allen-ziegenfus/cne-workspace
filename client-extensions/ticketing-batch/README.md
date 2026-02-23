# Ticketing System Batch Client Extension

This is a basic batch client extension that publishes an object definition for a ticketing system in Liferay.

## Contents

- `client-extension.yaml`: Defines the client extension type as `batch` and includes an `oAuthApplicationHeadlessServer` profile.
- `batch/batch.json`: Contains the object definition for a support `Ticket`.

## OAuth Profile

An `oAuthApplicationHeadlessServer` profile is included to provide the necessary permissions for the batch framework to:
- Access the Liferay Headless Batch Engine (`Liferay.Headless.Batch.Engine.everything`).
- Manage Object Definitions (`Liferay.Object.Admin.REST.everything`).

When deployed, Liferay automatically creates the OAuth application.

## Deployment

Deploy this client extension using the following Gradle command:

```bash
./gradlew :client-extensions:ticketing-batch:deploy
```

The object will be available under **Applications > Control Panel > Objects** (or **Manage > Tickets** depending on your Liferay configuration).


This worked ok - but no oauth profile was created by default

did not add assemble block