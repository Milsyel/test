import NewsItem from './NewsItem'
import Axios from 'axios';
import React, { useEffect, useState } from 'react'

const NewsList = () => {
    const [articles, setArticles] = useState([]);

    useEffect(() => {
        const getArticles = async () => {
            const res = await Axios.get("https://newsapi.org/v2/top-headlines?country=us&apiKey=5ad773aca4cc43caae7fa9a8e5b410a7"
            );

            setArticles(res.data.articles)
            console.log(res);
        };
        getArticles();
    }, []);

    return (
        <div>
            {articles.map(({ title, description, url, urlToImage }) => (
                <NewsItem
                    title={title}
                    description={description}
                    url={url}
                    urlToImage={urlToImage} />
            ))}
        </div>
    );

};

export default NewsList
