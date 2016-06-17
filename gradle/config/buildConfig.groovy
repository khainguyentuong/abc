binaryRepository {
    baseUrl = 'http://192.168.99.100:8081/artifactory'
    releaseUrl = "$baseUrl/libs-release-local"
    username = 'admin'
    password = 'Khoan2008'
}

environments {
    test {
        server {
            hostname = '192.168.99.100'
            sshPort = 22
            port = 8099
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    uat {
        server {
            hostname = '192.168.99.100'
            sshPort = 22
            port = 8199
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    production {
        server {
            hostname = '192.168.99.100'
            sshPort = 22
            port = 8299
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }
}