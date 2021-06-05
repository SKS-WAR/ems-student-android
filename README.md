# EMS Student Android
A part of EMS based MCQ android based application (Student Side).

Please find the Admin part on <a href="https://github.com/SKS-WAR/ems-admin-android" target="_blank">`https://github.com/SKS-WAR/ems-admin-android`</a>

## Installation
Clone this repository and import into **Android Studio**
```bash
git clone git@github.com:SKS-WAR/ems-student-android.git
```

## Configuration
### Keystores:
Create `app/keystore.gradle` with the following info:
```gradle
ext.key_alias='...'
ext.key_password='...'
ext.store_password='...'
```
And place both keystores under `app/keystores/` directory:
- `playstore.keystore`
- `stage.keystore`


## Build variants
Use the Android Studio *Build Variants* button to choose between **production** and **staging** flavors combined with debug and release build types


## Generating signed APK
From Android Studio:
1. ***Build*** menu
2. ***Generate Signed APK...***
3. Fill in the keystore information *(you only need to do this once manually and then let Android Studio remember it)*


## Contributing
> To get started...

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine using `https://github.com/SKS-WAR/ems-student-android.git`

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request using <a href="https://github.com/SKS-WAR/ems-student-android/pulls" target="_blank">`https://github.com/SKS-WAR/ems-student-android/pulls`</a>.

---

## Support

Reach out to me at one of the following places!

- LinkedIn <a href="https://www.linkedin.com/in/sudeepkumarsahoo/" target="_blank">`Sudeep Kumar Sahoo`</a>

