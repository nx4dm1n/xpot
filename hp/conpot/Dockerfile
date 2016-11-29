# ConPot Dockerfile by MO
#
# VERSION 16.10
FROM debian:jessie
MAINTAINER MO

# Include dist
ADD dist/ /root/dist/

# Setup apt
ENV DEBIAN_FRONTEND noninteractive
RUN echo "deb http://httpredir.debian.org/debian jessie main non-free" > /etc/apt/sources.list && \
    echo "deb http://httpredir.debian.org/debian jessie-updates main non-free" >> /etc/apt/sources.list && \ 
    echo "deb http://security.debian.org jessie/updates main" >> /etc/apt/sources.list && \
    apt-get update -y && \
    apt-get upgrade -y && \

# Install packages
    apt-get install -y git gcc-4.9 build-essential autoconf libtool pkg-config libmysqlclient-dev libsmi2ldbl libxslt1-dev python python-dev snmp-mibs-downloader supervisor && \

# Setup ConPot
    cd /opt/ && \
    git clone https://github.com/mushorg/conpot.git && \
    cd conpot/ && \
    python setup.py install && \
    cd .. && \
    rm -rf /opt/conpot /tmp/* /var/tmp/* && \

# Clean up
    apt-get remove -y git gcc-4.9 build-essential autoconf libtool pkg-config && \
    apt-get autoremove -y && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \

# Setup user, groups and configs
    addgroup --gid 2000 tpot && \
    adduser --system --no-create-home --shell /bin/bash --uid 2000 --disabled-password --disabled-login --gid 2000 tpot && \
    mv /root/dist/supervisord.conf /etc/supervisor/conf.d/supervisord.conf && \
    mkdir -p /etc/conpot && \
    mv /root/dist/conpot.cfg /etc/conpot/conpot.cfg && \
    mv /root/dist/kamstrup_382/template.xml /usr/local/lib/python2.7/dist-packages/Conpot-0.5.1-py2.7.egg/conpot/templates/kamstrup_382/ && \

# Clean up dist
    rm -rf /root/dist

# Run supervisor upon container start
CMD ["/usr/bin/supervisord","-c","/etc/supervisor/supervisord.conf"]
