# Dice_Assignment
## Weather Forecast API Server
## Purpose
 Weather Forecast is a weather update application designed to provide users with real-time weather information after registration and login.

## Tech Stack
- Java
- MySQL
- Spring Boot
- Spring Security
- Swagger UI

## Functionality
### Registration
- Users can sign up for an account by providing necessary details.
- Registration includes fields such as username, email, and password.

### Login
- Registered users can securely log in to their accounts.
- Authentication is handled using Spring Security.

### Weather Updates
- Upon successful login, users can access weather updates.
- Weather information is fetched from external sources or APIs.
- Users can view the weather forecast for their desired location.
The different modules use three different Weather APIs

| API                                                                         | Description                                          |
|-----------------------------------------------------------------------------|------------------------------------------------------|
| `POST https://forecast9.p.rapidapi.com/oauth2/token`                        | Generate an access token (Bearer token) for app only |
| `GET https://forecast9.p.rapidapi.com/rapidapi/forecast/{cityName}/hourly/` | Get hourly wethore summary by city name                     |
| `GET https://forecast9.p.rapidapi.com/rapidapi/forecast/{cityName}/summary/`| Get full summary by city name                                |

## Hosting
- The application is hosted on Railway.app.
- Access the application through the provided host link: [WeatherforeCasting Host Link](https://diceassignment-production-0abf.up.railway.app/swagger-ui/index.html#/)

## Additional Notes
- Ensure MySQL is properly configured for the application to function correctly.
- Continuous monitoring and updating of weather data sources may be required for accurate updates.
- Consider implementing additional features such as location-based weather updates or personalized notifications based on user preferences for future iterations.

