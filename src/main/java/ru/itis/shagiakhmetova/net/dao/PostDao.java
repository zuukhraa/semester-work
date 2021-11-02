package ru.itis.shagiakhmetova.net.dao;

import ru.itis.shagiakhmetova.net.model.Post;
import java.util.List;

public interface PostDao {
    public void save(Post post);
    public List<Post> getAll();
    public List<Post> getById(int user_id);
    public Post get(int id);
}
