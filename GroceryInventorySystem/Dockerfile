# Use an official lightweight JDK image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy everything from your local folder to the container
COPY . /app

# Compile Java files inside the package
RUN javac src/GroceryBasics/*.java

# Run the main class with the correct package name
CMD ["java", "-cp", "src", "GroceryBasics.GroceryInventorySystem"]
