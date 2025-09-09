# Improvement Tasks Checklist

Below is an ordered, actionable checklist to improve this repository at both architectural and code levels. Each task is designed to be self-contained and checkable.

1. [ ] Add a clear project description to README.md (purpose, modules, how to run, prerequisites).
2. [ ] Add a CONTRIBUTING.md with guidelines for branching, commits, PRs, and coding standards.
3. [ ] Add a CODE_OF_CONDUCT.md and LICENSE (e.g., MIT) to clarify community and legal aspects.
4. [ ] Standardize Git ignore files (.gitignore) for Java/Maven/IDE artifacts and remove tracked build outputs in target/.
5. [ ] Normalize file and directory naming to a single language (prefer English) for consistency (e.g., package names and folders).
6. [ ] Ensure Java package names follow standard conventions (lowercase, meaningful, no accents), e.g., estruturaRepetitivas -> estruturasrepetitivas.
7. [ ] Introduce consistent code style (Google Java Style or Sun/Oracle) and enforce via Checkstyle or Spotless.
8. [ ] Configure Maven plugins for quality gates: maven-checkstyle-plugin, SpotBugs, PMD, and Enforcer rules (Java version, dependency convergence).
9. [ ] Set the Java version in Maven (maven-compiler-plugin) at root POM and inherit in modules; remove duplicate or conflicting configs.
10. [ ] Convert to a proper multi-module Maven structure (if intended): parent POM manages versions and modules; submodules inherit from parent.
11. [ ] Align artifactId/groupId/version naming; add meaningful groupId (e.g., io.github.username) and semantic versioning.
12. [ ] Remove compiled classes from VCS (modulo-basico/target/**). Add target/ to .gitignore.
13. [ ] Add basic unit test scaffolding using JUnit 5; ensure surefire plugin is configured and tests run with mvn test.
14. [ ] Create tests for example classes (e.g., capturing console I/O) to validate behavior and prevent regressions.
15. [ ] Refactor classes with main methods into small, pure methods that can be unit-tested independently.
16. [ ] Replace interactive Scanner input in main flows with parameterized methods; keep main as a thin CLI wrapper.
17. [ ] Validate user input robustly (e.g., non-numeric input, hours outside 0–23) and provide helpful error messages.
18. [ ] Fix logical edge cases (e.g., condicaoEncademento: handle hour == 24, and add else branch for 18–24 inclusive).
19. [ ] Add JavaDoc to public classes/methods describing purpose, parameters, return values, and examples.
20. [ ] Ensure consistent language in output messages and correct spelling/grammar (e.g., “Boa tarde” vs “Bom tarde”).
21. [ ] Apply consistent naming conventions in methods and files (camelCase for methods/variables, PascalCase for classes).
22. [ ] Reorganize package structure by topic and responsibility (e.g., basics/conditionals, basics/sequentials, basics/loops).
23. [ ] Introduce a simple CLI interface layer for exercises (args parsing) to avoid scanning System.in during tests.
24. [ ] Add logging (java.util.logging or SLF4J) where appropriate instead of System.out for non-UI messages.
25. [ ] Add CI workflow (e.g., GitHub Actions) to run mvn -B -q verify on push and PR; include code quality checks.
26. [ ] Add badges (build status, license) to README.md once CI and license are in place.
27. [ ] Review and pin plugin and dependency versions in POMs to avoid build instability.
28. [ ] Use Maven Dependency Management for shared versions and BOMs if adding libraries.
29. [ ] Add Maven Wrapper (mvnw) for consistent builds across environments.
30. [ ] Set up JaCoCo for test coverage and add a minimal threshold; publish report artifact in CI.
31. [ ] Add spotbugs-exclude.xml for known intentional patterns, if needed, to keep signal high.
32. [ ] Add pre-commit hooks (e.g., via Spotless or custom script) to auto-format and run quick checks locally.
33. [ ] Internationalization: consider i18n of console messages (resource bundles) to support multiple locales.
34. [ ] Document module layout and how to add new exercises in a docs/structure.md guide.
35. [ ] Add examples of input/output sessions for each exercise to README or separate docs/exercises.md.
36. [ ] Review and eliminate dead code, commented-out blocks, and unused imports.
37. [ ] Replace magic numbers with constants or enums (e.g., hour bounds MIN_HOUR = 0, MAX_HOUR = 23).
38. [ ] Make methods side-effect-aware; avoid global state and pass dependencies explicitly.
39. [ ] Add exception handling strategy: wrap/translate checked exceptions where appropriate, fail fast with clear messages.
40. [ ] Ensure platform-independent file encodings (UTF-8) in Maven compiler and surefire plugins.
41. [ ] Normalize line endings and ensure .editorconfig is present to enforce whitespace and indentation.
42. [ ] Add a CHANGELOG.md following Keep a Changelog to record improvements and changes over time.
43. [ ] Establish release process (tags, versions, GitHub Releases if applicable).
44. [ ] Add a simple Makefile or scripts for common tasks (build, test, format, lint) to streamline contributions.
45. [ ] Remove IDE-specific project files (.idea/**) from VCS or keep minimal configs; ensure they are ignored appropriately.
46. [ ] Audit for non-ASCII characters in package/class names that may cause issues; rename carefully preserving history.
47. [ ] Create a small architectural overview diagram (even for a simple project) and place it under docs/architecture.md.
48. [ ] Add performance considerations note (even if trivial) for input loops to teach best practices.
49. [ ] Ensure main classes are not in example packages intended for library distribution; separate app vs library code if needed.
50. [ ] Verify that source/target compatibility and runtime JRE versions match across environments.
