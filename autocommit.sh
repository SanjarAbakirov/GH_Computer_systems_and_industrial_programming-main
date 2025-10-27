PATH="$(pwd)"

cd "$PATH" || exit

echo "Control all changes in $PATH..."

while true, do
    if ! git diff --quiet || ! git diff --cached --quiet; then
	echo "Changes defined! Commit and push..."
	git add .
	git commit -m "auto commit $(date)"
	git push
    fi
    sleep 10
done
