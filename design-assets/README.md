# Figma screen assets

Source file: DAHTA, `8bvl8era18Ni0CztkeUpMa`.

- Main: `39775:20157`, app window 1700 × 1184.
- Waiting: `39793:8983`, app window 840 × 1184.
- End summary: `39775:20518`, modal over the main app window.

SVG files are the original Figma MCP asset exports. The PNG counterparts live
in `src/main/res/drawable-nodpi`. Backgrounds use their original dimensions;
icons are rendered at 3× using resvg-py 0.5.0 to preserve SVG filter effects.
The round main logo is reused in matching waiting and summary logo slots.
No temporary Figma asset URL is used at runtime.

Waiting is currently a UI session, without a vehicle, microphone or navigation
connection. Its subtitle therefore reports that it is waiting for a vehicle
connection. Summary duration is the elapsed UI session time, not metered trip
time. Unavailable passenger statistics use an em dash instead of sample values.
Care-mode preference, active-session state and unacknowledged summary persist
across process restarts. No audio is collected.
