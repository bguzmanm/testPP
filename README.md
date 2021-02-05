# Ejemplo de implementación capa Servicios y JUnit

## 3ro de Febrero

- Realizamos pequeña implementación de JUnit
- Inclimos capa de Servicios, que divide al Controller del Repositorio, y nos permite aislar de mejor manera la lógica del negocio.

## 5 de Febrero
- Incluimos en pom.xml dependencia a spring-test y corregimos versión de JUnit a la 4.12
- Implementamos @Configuration, @RunWith y @ContextConfiguration apuntando a root-context.xml
- Incluimos Suite de pruebas.