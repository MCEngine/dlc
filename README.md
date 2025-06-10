# 📦 DLC Downloader

This project provides a way to fetch available DLCs from a central website and download them directly in-game using the command:

```
/dlc {project} {dlc_id}
```

## ⚠️ Requirements

This project requires a server to host DLC JAR files.

It is recommended to use a URL structure like:

```
https://dlc.example.com/{project}/{dlc_id}/{dlc_version}/{file_name}.jar
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

## 🔐 Important

Always think about **security** when downloading and using dlcs.

Any dlc you load onto your server should have a clearly identifiable **author**.

This helps determine whether the dlc can be trusted and ensures the security and stability of your server.

Avoid duplicate content by following a standard and unified dlc hosting structure.
