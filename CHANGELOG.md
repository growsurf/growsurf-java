# Changelog

## [1.1.2](https://github.com/growsurf/growsurf-java/compare/v1.1.1...v1.1.2) (2026-07-11)


### Bug Fixes

* support retry-safe API key rotation ([bb2b12b](https://github.com/growsurf/growsurf-java/commit/bb2b12b166437f6f1d13f4b7028bd7d8a1a0bda1))

## [1.1.1](https://github.com/growsurf/growsurf-java/compare/v1.1.0...v1.1.1) (2026-07-09)


### Bug Fixes

* remove referral screenshot REST surface ([2af8db8](https://github.com/growsurf/growsurf-java/commit/2af8db8c0f50b085a8d103ad8a8b3be9b58b1e7a))

## [1.1.0](https://github.com/growsurf/growsurf-java/compare/v1.0.0...v1.1.0) (2026-07-08)


### Features

* add account webhook and participant APIs ([40c13fa](https://github.com/growsurf/growsurf-java/commit/40c13fade973ad4860717b2657d6fee37599cc40))


### Bug Fixes

* format Java SDK Kotlin sources ([346c959](https://github.com/growsurf/growsurf-java/commit/346c95918dbd4081911106b66c8596d2d161dd86))

## [1.0.0](https://github.com/growsurf/growsurf-java/compare/v0.9.0...v1.0.0) (2026-07-03)


### ⚠ BREAKING CHANGES

* campaign create no longer accepts `options`, and campaign update no longer accepts the design / emails / options / notifications / installation config blobs — edit those via the new config sub-resources. Reward-config CRUD moved from /campaign/{id}/rewards to /campaign/{id}/reward-configs[/{campaignRewardId}].

### Features

* add campaign management endpoints; drop deprecated create/update config blobs ([b48e7b8](https://github.com/growsurf/growsurf-java/commit/b48e7b84d46fc9be44ddd72129c76d5821388363))


### Bug Fixes

* **proguard:** keep @ExcludeMissing + IsMissing so unset fields serialize under R8 ([7be85b6](https://github.com/growsurf/growsurf-java/commit/7be85b6f175dde3d2ddcef2a60dd966480670e09))

## [0.9.0](https://github.com/growsurf/growsurf-java/compare/v0.8.0...v0.9.0) (2026-07-01)


### Features

* **api:** add campaign create/update/clone and program-reward CRUD ([1ee33f5](https://github.com/growsurf/growsurf-java/commit/1ee33f5fadef3c4019e1c6e19a9b20e49a3aa61a))

## 0.8.0 (2026-06-29)

Full Changelog: [v0.7.1...v0.8.0](https://github.com/growsurf/growsurf-java/compare/v0.7.1...v0.8.0)

### Features

* **api:** support delayed referral rewards and affiliate refunds ([8579218](https://github.com/growsurf/growsurf-java/commit/857921862545973e60128be16aba53cd8be9039a))


### Styles

* format generated Kotlin with ktfmt ([5d17270](https://github.com/growsurf/growsurf-java/commit/5d17270eaca5f1bc3c1a29c3cda26bc39db71089))

## 0.7.1 (2026-06-26)

Full Changelog: [v0.7.0...v0.7.1](https://github.com/growsurf/growsurf-java/compare/v0.7.0...v0.7.1)

## 0.7.0 (2026-06-23)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/growsurf/growsurf-java/compare/v0.6.0...v0.7.0)

### Features

* **api:** add payoutSettings to Participant ([93dc2fd](https://github.com/growsurf/growsurf-java/commit/93dc2fd2cdb55857d9e489c4076da589d7395a12))
* **api:** manual updates ([556ab4c](https://github.com/growsurf/growsurf-java/commit/556ab4c48837baadbea4b90b4ef970a9f96c931f))

## 0.6.0 (2026-05-25)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/growsurf/growsurf-java/compare/v0.5.0...v0.6.0)

### Features

* **api:** manual updates ([91fa193](https://github.com/growsurf/growsurf-java/commit/91fa193acc15870291375750a215fd6f17e5c4c8))

## 0.5.0 (2026-05-20)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/growsurf/growsurf-java/compare/v0.4.0...v0.5.0)

### Features

* **api:** Add Participant.mobileInstanceId ([f1ce447](https://github.com/growsurf/growsurf-java/commit/f1ce447331f21eca35c164b4acb337955dc8d687))

## 0.4.0 (2026-05-19)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/growsurf/growsurf-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** manual updates ([4dea188](https://github.com/growsurf/growsurf-java/commit/4dea1880d68f4cd74e6fc8a5cabc3ba73ceeeb26))

## 0.3.0 (2026-05-15)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/growsurf/growsurf-java/compare/v0.2.0...v0.3.0)

### Features

* **api:** manual updates ([328fa62](https://github.com/growsurf/growsurf-java/commit/328fa620d867baa3748fffa6120922de125d3d5c))

## 0.2.0 (2026-05-13)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/growsurf/growsurf-java/compare/v0.1.0...v0.2.0)

### Features

* **api:** manual updates ([3ce79ce](https://github.com/growsurf/growsurf-java/commit/3ce79ce82542a946241fca2c0268f1c25a3d3b38))

## 0.1.0 (2026-05-13)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/growsurf/growsurf-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([360f13c](https://github.com/growsurf/growsurf-java/commit/360f13cb501c17ff7128e5bca5ac812f2e6bf36d))


### Chores

* configure new SDK language ([0fb9ff4](https://github.com/growsurf/growsurf-java/commit/0fb9ff4aaec888133b3ebd441e91898d7e7971d2))
* update SDK settings ([bb94385](https://github.com/growsurf/growsurf-java/commit/bb943852d2732686addb8507adb904ce512908fc))
