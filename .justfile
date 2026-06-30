# https://just.systems/man/en/

[private]
@default:
    just --list --unsorted

# Run linter.
@lint:
    docker run --rm --read-only --volume=$PWD:$PWD:ro --workdir=$PWD kokuwaio/just:1.55.1
    docker run --rm --read-only --volume=$PWD:$PWD:ro --workdir=$PWD kokuwaio/yamllint:v1.38.0
    docker run --rm --read-only --volume=$PWD:$PWD:rw --workdir=$PWD kokuwaio/markdownlint:0.49.0 --fix
    docker run --rm --read-only --volume=$PWD:$PWD:ro --workdir=$PWD kokuwaio/shellcheck:v0.11.0
    docker run --rm --read-only --volume=$PWD:$PWD:ro --workdir=$PWD kokuwaio/renovate-config-validator:43
    docker run --rm --read-only --volume=$PWD:$PWD:ro --workdir=$PWD woodpeckerci/woodpecker-cli:v3 lint --strict
