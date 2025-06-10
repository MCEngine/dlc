# 📦 DLC Downloader

This project provides a way to fetch available DLCs from a central website and download them directly in-game using the command:

```
/dlc {project} {dlc_id}
```

## ⚠️ Requirements

This project requires a server to host DLC JAR files.

It is recommended to use a URL structure like:

```
https://dlc.example.com/{project}/{dlc_id}/{dlc_version}
```

✅ This allows everyone to use the same path format—only the domain needs to be changed.

## 💡 Usage

- To download the **latest version** of a DLC:
  ```
  /dlc {project} {dlc_id}
  ```

- To download a **specific version**:
  ```
  /dlc {project} {dlc_id} {version}
  ```
