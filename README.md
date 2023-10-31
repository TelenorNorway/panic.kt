# Panic.kt

_Panic and kill the current process_

## Dependency

In your gradle file

_Follow [this guide](https://github.com/testersen/no.ghpkg) on how to set up your environment for GitHub packages._

```kt
plugins {
	id("no.ghpkg") version "0.3.3"
}

repositories {
	git.hub("telenornorway", "panic.kt")
	// or <.. the below> if you're spicy 🌶️
	// git.hub("telenornorway")
}

dependencies {
	implementation("no.telenor.kt:panic:<VERSION HERE>")
}
```

## Usage

```kt
import no.telenor.kt.panic

panic("Something went wrong", ex)
```
