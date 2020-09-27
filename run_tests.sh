#!/usr/bin/env bash
set -e 

#. ~/venv/bin/activate

PYTHONPATH=. python -m pystache.commands.test
