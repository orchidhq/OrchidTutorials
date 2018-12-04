---
menu:
  - type: pages
    group: 'staff'
---

{% for page in findAll(collectionType='pages', collectionId='staff') %}
- [{{page.title}}]({{page.link}})
{% endfor %}
