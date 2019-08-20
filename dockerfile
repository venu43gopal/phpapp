From nimmis/apache-php5
Maintainer "VenuGopal <kasibhotla43@gmail.com>"
RUN apt-get update

#update repository
RUN apt-get update -y

#Install Apache2
RUN apt-get install -y apache2

#copy application files
RUN rm -rf /var/www/html/*
ADD website /var/www/html

#open port 80 & 443
EXPOSE 80
EXPOSE 443

#start Apache Service
CMD ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
