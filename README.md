### Unit Test Nedir?
**Unit**; Bir objenin davranışlarının her biri.

**Unit Test**; Objenin bir davranışının bağımsız olarak Test'i


### Unit Test'in Yapısı
**Given**; Obje'nin istenilen duruma(state) getirilmesi.

**When**; Obje'den istediğimiz aksiyonu almasını istemek.

**Then**; Obje'nin gelmesini beklediğimiz yeni durumunun kontrolü.

**Clean**; Objenin gerekiyorsa test önce duruma getirilmesi.

### Assumptions 
- Bir var sayıma bağlı olarak testleri çalıştırmak
- Test method veya Assertion'lar bazında
- **assumeTrue(boolean, message)**
- **assumeFalse(boolean, message)**
- **assumingThat(boolean, Executable)**