# I use cars in this example
#
str(cars)
plot(cars)


# dependent variable
#
y <- cars$dist

# independent variable
x <- cars$speed

# adding ones to x 
x <- cbind(1,x)

# initalize theta vector
theta<- c(-2,5)

# Number of the observations
m <- nrow(x)

#Calculate cost
cost <- sum(((x%*%theta)- y)^2)/(2*m)

# Set learning parameter
alpha <- 0.005

#Number of iterations
iterations <- 1500

# updating thetas using gradient update
for(i in 1:20)
{
  theta[1] <- theta[1] - alpha * (1/m) * sum(((x%*%theta)- y))
  theta[2] <- theta[2] - alpha * (1/m) * sum(((x%*%theta)- y)*x[,2])
  abline(a=theta[1],b=theta[2],color=i)
}

abline(a=theta[1],b=theta[2])
