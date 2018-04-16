build:
	docker build -t jersey-img .
run:
	docker run -p 8080:8080 -d --name jersey-cnt jersey-img

push:
	docker tag jersey-img bigthetahub/jersey-img
	docker push bigthetahub/jersey-img

publish: build push