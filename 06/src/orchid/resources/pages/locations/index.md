---
---

{% for page in findAll(collectionType='pages', collectionId='locations') %}
- [{{page.title}}]({{page.link}})
{% endfor %}
