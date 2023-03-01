#!/usr/bin/env bash
set -euo pipefail

if [[ -n "$(git status --porcelain)" ]]; then
  echo "-----------------------------"
  echo "ERROR: The project is dirty!"
  echo "-----------------------------"
  git status
  echo
  git diff
  exit 1
else
  echo "--------------"
  echo "OK: All good!"
  echo "--------------"
fi
