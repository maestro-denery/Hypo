plugins {
    java
    `hypo-java`
    `hypo-test-scenario-data`
}

tasks.compileScenario01Java {
    options.release.set(8)
}

tasks.compileScenario02Java {
    options.release.set(16)
}

tasks.compileScenario03Java {
    options.release.set(16)
}
