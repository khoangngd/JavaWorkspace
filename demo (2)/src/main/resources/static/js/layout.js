$(document).ready(function () {
    console.log('loaded');

    $('#btnExport').click(function () {
        let typeService = $('#typeService').val();
        if (typeService == 1 || typeService == 0) {
            $.ajax({
                //url: " http://localhost:8081/api/v1/getAll/",
                url: "http://localhost:8081/api/v1/getAllStudent/",
                type: 'GET',
                dataType: 'text', // added data type
                //data: typeService,
                success: function (res) {
                    console.log(res);
                    alert('done');

                }
            });
        }
        if (typeService == 2  || typeService == 0) {
            $.ajax({
                //url: " http://localhost:8081/api/v1/getAll/",
                url: "http://localhost:8081/api/v1/getAllTeacher/",
                type: 'GET',
                dataType: 'text', // added data type
                //data: typeService,
                success: function (res) {
                    console.log(res);
                    alert('done');
                }
            });
        }
        console.log('typeService', typeService);
        $.ajax({
            //url: " http://localhost:8081/api/v1/getAll/",
            url: " http://localhost:8081/api/v1/getById/" + typeService,
            type: 'GET',
            dataType: 'text', // added data type
            //data: typeService,
            success: function (res) {
                console.log(res);

                /* function convertArrayOfObjectsToCSV(args) {
                     var result, ctr, keys, columnDelimiter, lineDelimiter, data;
                     data = args.data || null;
                     if (data == null || !data.length) {
                         return null;
                     }

                     columnDelimiter = args.columnDelimiter || ',';
                     lineDelimiter = args.lineDelimiter || '\r\n';

                     keys = Object.keys(data[0]);

                     result = '';
                     result += keys.join(columnDelimiter);
                     result += lineDelimiter;

                     data.forEach(function(item) {
                         ctr = 0;
                         keys.forEach(function(key) {
                             if (ctr > 0) result += columnDelimiter;

                             result += item[key];
                             ctr++;
                         });
                         result += lineDelimiter;

                     });

                     result += "Total";
                     result += columnDelimiter;
                     result += columnDelimiter;
                     result += columnDelimiter;
                     result += totalAmount;
                     result += columnDelimiter;
                     result += totalHash;

                     return result;
                 }
                 window.downloadCSV = function(args) {
                     var data, filename, link;

                     var csv = convertArrayOfObjectsToCSV({
                         data: res
                     });
                     if (csv == null) return;

                     filename = args.filename || Xrm.Page.getAttribute("name").getValue() + ".csv";

                     if (!csv.match(/^data:text\/csv/i)) {
                         csv = 'data:text/csv;charset=utf-8,' + csv;
                     }
                     data = encodeURI(csv);

                     link = document.createElement('a');
                     link.setAttribute('href', data);
                     link.setAttribute('download', filename);
                     link.click();
                 }*/
            }
        });
    })
});