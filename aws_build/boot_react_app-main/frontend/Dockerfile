FROM node:18 AS builder

# from docker-compose.yml
ARG REACT_APP_API_KEY

# ARG to ENV
ENV REACT_APP_API_KEY=$REACT_APP_API_KEY

# create .env
# RUN echo "REACT_APP_API_KEY=$REACT_APP_API_KEY" > .env

WORKDIR /app
COPY package.json ./
RUN npm install
COPY . .

# apply ENV (during build time)
RUN npm run build

# run Nginx
FROM nginx:alpine
COPY --from=builder /app/build /usr/share/nginx/html
EXPOSE 80
COPY nginx.conf /etc/nginx/conf.d/default.conf
CMD ["nginx", "-g", "daemon off;"]