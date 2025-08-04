## English
A catalog of reusable Springboot Gradle setup templates.<br>
Provides modular, maintainable, and standardized configurations to bootstrap your projects quickly.<br>
Enables easy selection and customization of build setups following the catalog pattern.<br>

## Korean
재사용 가능한 Springboot Gradle 셋업 템플릿 카탈로그입니다.<br>
모듈화되고 유지보수하기 쉬우며 표준화된 구성을 제공하여 프로젝트를 빠르게 시작할 수 있습니다.<br>
카탈로그 방식을 따라 빌드 셋업을 손쉽게 선택하고 커스터마이징할 수 있습니다.

## Reference
Docs: https://toml.io/en/ <br>
git: https://github.com/toml-lang/toml

## TOML has useful native types
- Key/Value Pairs
- Arrays
- Tables
- Inline tables
- Arrays of tables
- Integers & Floats
- Booleans
- Dates & Times, with optional offsets

## Structure

project<br>
├── build.gradle.kts          ← Kotlin DSL<br>
├── settings.gradle.kts       ← Kotlin DSL<br>
├── gradle ← Version Catalog<br>
└──── libs.versions.toml<br>
└── backend-api
