#!/bin/bash
mongorestore --drop
# Kiểm tra kết quả lệnh mongorestore
if [ $? -eq 0 ]; then
  echo "MongoDB restore completed successfully."
else
  echo "MongoDB restore failed."
fi
