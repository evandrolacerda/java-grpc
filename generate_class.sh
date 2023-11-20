protoc \
  --proto_path=./src/main/resources/ \
  --java_out=./src/main/java/ \
  --plugin=protoc-gen-grpc-java \
  --grpc-java_out=./src/main/java/ user.proto