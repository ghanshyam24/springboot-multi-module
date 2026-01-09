## springboot-multi-module

springboot-multi-module
│
├── build.gradle          (parent)
├── settings.gradle
│
├── user-http             (REST / main app)
│   └── build.gradle
│
├── user-kafka            (Kafka consumer/producer)
│   └── build.gradle
│
└── user-shared           (DTO, entity, mapper, utils)
└── build.gradle
