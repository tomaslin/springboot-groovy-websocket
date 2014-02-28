Simple websockets with Spring boot, groovy and cloud foundry.

Running the application
-----------------------

intall gvm
```curl -s get.gvmtool.net | bash```

install spring boot
```gvm install springboot```

run the app
```spring run *.groovy```

Deploying to Cloud Foundry
--------------------------

Install the cloud foundry client
Follow the directions at http://docs.cloudfoundry.org/devguide/installcf/install-go-cli.html
TL:DR; ```brew install cloudfoundry-cli```

login to cloud foundry
```cf login```

build a local copy of your jar file
```spring jar webapp.jar *.groovy```

deploy your jar file
```cf push bootsocket -p webapp.jar```

